using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace Biblioteca
{
    public partial class UserF : Form
    {
        string id;
        public static string passingtext;
        public UserF()
        {
           
            InitializeComponent();
            textBox2.PasswordChar = '*';
            
    }

        private void button1_Click(object sender, EventArgs e)
        {
            int i;
        string connetionString = null;
        MySqlConnection cnn;
           
        connetionString = @"server=localhost;user id=root;database=users;password=1997williAM";
        
        cnn = new MySqlConnection(connetionString);
            cnn.Open();
            MySqlCommand cmd1 = cnn.CreateCommand();
            cmd1.CommandType = CommandType.Text;
            cmd1.CommandText = "select idUsers from users where Username='" + textBox1.Text + "' and Password='" + textBox2.Text + "'";
            cmd1.ExecuteNonQuery();
            MySqlDataReader myReader = null;
            myReader = cmd1.ExecuteReader();
            while (myReader.Read())
            {
                id= myReader["idUsers"].ToString();
            }
            cnn.Close();

            try
            {
            cnn.Open();
            MySqlCommand cmd = cnn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "select idUsers from users where Username='" + textBox1.Text + "' and Password='" + textBox2.Text + "'";
            cmd.ExecuteNonQuery();

            DataTable dt = new DataTable();
            MySqlDataAdapter da = new MySqlDataAdapter(cmd);
        

                    da.Fill(dt);
            i = Convert.ToInt32(dt.Rows.Count.ToString());

            if (i == 0)
            {
                label3.Text = "Invalid Username or Password";
            }
            else
            {
                this.Hide();
                passingtext = textBox1.Text;
                Form5 f5 = new Form5(id);
                f5.Show();
            }
                cnn.Close();
        }
        catch (Exception ex)
    {
    MessageBox.Show("Cannot open connection ! ");
    }
}

        private void button2_Click(object sender, EventArgs e)
        {
            RegisterF rf = new RegisterF();
            rf.Show();
        }

        private void UserF_Load(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
     /*  private MySqlConnection con =  new MySqlConnection("Data Source=MySQL Community Server (GPL);Port=3306;Database=biblioteca;User ID=root;Password =Alex26");
        private int i;
            public UserF()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
          
             i = 0;
            con.Open();
         MySqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "select * from users where username='" + textBox1.Text + "' and password='"+ textBox2.Text + "'";
            cmd.ExecuteNonQuery();
            DataTable dt = new DataTable();
            MySqlDataAdapter da = new MySqlDataAdapter(cmd);
            da.Fill(dt);

            i = Convert.ToInt32(dt.Rows.Count.ToString());

            if (i == 0)
            {
                label3.Text = "Invalid Username or Password";
            }
            else
            {
                this.Hide();
                Form5 f5 = new Form5();
                f5.Show();
            }
            con.Close();
        }
    }
}
*/