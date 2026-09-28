"""
Redes: cliente/servidor TCP e enquadramento
Gilmar da Silva — 201269
Conceitos: TCP entrega fluxo de bytes, não mensagens completas. Um delimitador informa onde termina uma mensagem.
Execute: python 20-aplicacao/03_socket_local.py
Desafio: Envie a mensagem em duas partes e explique por que um único recv não é suficiente.
"""

import socket,threading
def linha(conexao):
    dados=bytearray()
    while not dados.endswith(b'\n'):
        parte=conexao.recv(1)
        if not parte: raise EOFError('Mensagem incompleta')
        dados.extend(parte)
        if len(dados)>100: raise ValueError('Mensagem excessiva')
    return bytes(dados)
with socket.socket() as servidor:
    servidor.bind(('127.0.0.1',0)); servidor.listen(1); servidor.settimeout(5)
    def atender():
        conn,_=servidor.accept()
        with conn:
            conn.settimeout(5); conn.sendall(linha(conn).upper())
    worker=threading.Thread(target=atender); worker.start()
    with socket.create_connection(servidor.getsockname(),timeout=5) as cliente:
        cliente.sendall(b'java\n'); resposta=linha(cliente)
        assert resposta==b'JAVA\n'; print(resposta.decode().strip())
    worker.join(timeout=5)
    assert not worker.is_alive()
