using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class WelcomeF : Form
    {
        public WelcomeF()
        {
            InitializeComponent();
        }
    
        private void button1_Click(object sender, EventArgs e)
        {
            AdminF f3 = new AdminF(); // Instantiate a Form3 object.
            f3.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            UserF f2 = new UserF(); // Instantiate a Form3 object.
            f2.Show();
        }

        private void WelcomeF_Load(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
