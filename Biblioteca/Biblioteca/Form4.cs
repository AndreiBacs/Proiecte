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
    public partial class Form4 : Form
    {
        public Form4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Addbook ad = new Addbook();
            ad.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            UpdateB ub = new UpdateB();
            ub.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            RequestedB req = new RequestedB();
            req.Show();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            try
            {
                foreach (Form f in Application.OpenForms.Cast<Form>().ToList())
                {
                    if (f.Name != "AdminF")
                    {
                        f.Close();
                      new AdminF().Show();
                    }
                }
            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Return ret = new Return();
            ret.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ManUsers manu  =new  ManUsers();
            manu.Show();
        }

        private void Form4_Load(object sender, EventArgs e)
        {

        }
    }
}
