"""
Endereço, porta e protocolo
Responsável: Gilmar da Silva
Conceitos: IP identifica uma interface; porta identifica um serviço de transporte. URL também contém protocolo, caminho e parâmetros.
Execução: python 00-fundamentos/02_protocolos.py
Pratique: Compare uma URL HTTPS sem porta explícita; pesquise a porta padrão.
"""
from urllib.parse import urlparse, parse_qs
url = urlparse('http://127.0.0.1:8080/materiais?pagina=2')
assert url.hostname == '127.0.0.1' and url.port == 8080
assert parse_qs(url.query)['pagina'] == ['2']
print('Protocolo:', url.scheme, 'Caminho:', url.path)
print('HTTP define mensagens; TCP entrega um fluxo confiável; IP encaminha pacotes.')
