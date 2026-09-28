/*
Identificação: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Desktop
Arquivo de estudo: DAO_Connection.cs
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjetoEstudio
{
    class DAO_Connection
    {
        public static MySqlConnection con;

        public static Boolean getConnection(String local, String banco, String user, String senha)
        {
            Boolean retorno = false;
            try
            {
                con = new MySqlConnection("server=" + local + ";User ID=" + user + ";database=" + banco + ";password=" + senha);
                retorno = true;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            return retorno;
        }

        public static int login(String usuario, String senha)
        {
            int tipo = 0;
            try
            {
                con.Open();
                MySqlCommand login = new MySqlCommand("Select * from Estudio_Login where usuario ='" + usuario + "' and senha ='" + senha + "'", con);
                MySqlDataReader resultado = login.ExecuteReader();
                if (resultado.Read())
                {
                    tipo = Convert.ToInt32(resultado["tipo"]);
                }
                resultado.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                con.Close();
            }
            finally
            {
                con.Close();
            }
            return tipo;
        }

        

        public static Boolean CadLogin(string usuario, string senha, int tipo)
        {
            bool cad = false;
            try
            {
                con.Open();
                MySqlCommand insere = new MySqlCommand("insert into Estudio_Login (usuario, senha, tipo) " +
                    "values ('" + usuario + "','" + senha + "'," + tipo + ")", con);
                insere.ExecuteNonQuery();
                cad = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                con.Close();
            }
            return cad;
        }
    }
}
