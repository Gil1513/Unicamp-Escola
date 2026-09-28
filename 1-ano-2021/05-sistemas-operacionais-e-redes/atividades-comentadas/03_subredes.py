"""
IPv4 e pertencimento a uma sub-rede
Autor: Gilmar da Silva
Matéria: Sistemas Operacionais e Redes de Computadores
Conceitos: O prefixo /24 fixa 24 bits da rede. Rede e broadcast não são endereços de hosts nesse exemplo. Portas identificam serviços, enquanto IP identifica a interface.
Objetivo: Obter 254 hosts em 192.168.10.0/24 e identificar um endereço de fora da rede.
Execução (nesta pasta): python 03_subredes.py
Pratique: Compare /24 e /26. Por que /31 e /32 precisam de tratamento diferente?
"""
from ipaddress import IPv4Network, IPv4Address

if __name__ == '__main__':
    rede = IPv4Network('192.168.10.0/24')
    print('Máscara:', rede.netmask)
    print('Broadcast:', rede.broadcast_address)
    print('Hosts:', sum(1 for _ in rede.hosts()))
    for endereco in ['192.168.10.42', '192.168.11.42']:
        print(endereco, IPv4Address(endereco) in rede)
    print('Exemplos de portas: HTTP 80, HTTPS 443, DNS 53.')
