"""
Cópia e conferência de arquivos
Responsável: Gilmar da Silva
Conceitos: Uma cópia deve ser conferida; hashes detectam alterações no conteúdo, mas não provam a autoria.
Execução: python 00-fundamentos/02_backup.py
Pratique: Explique por que uma cópia na mesma unidade não protege contra falha física.
"""
from pathlib import Path
from tempfile import TemporaryDirectory
import hashlib, shutil
with TemporaryDirectory() as pasta:
    origem, copia = Path(pasta)/'anotacoes.txt', Path(pasta)/'backup.txt'
    origem.write_text('Gilmar da Silva - 201269', encoding='utf-8')
    shutil.copy2(origem, copia)
    digest = lambda p: hashlib.sha256(p.read_bytes()).hexdigest()
    assert digest(origem) == digest(copia)
    copia.write_text('alterado', encoding='utf-8')
    assert digest(origem) != digest(copia)
    print('Cópia conferida e alteração detectada.')
