import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
// Instanciando a classe JFrame e criando um painel com o título "Tela de Exemplo"
        JFrame frame = new JFrame("Tela Exemplo");

// Define a operação de fechamento padrão do JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Utilizando o método setSize para determinar a altura e a largura da tela
        frame.setSize(400, 300);

// Utilizando o método setLayout para definir um layout padrão; o BorderLayout divide o layout em regiões: norte, sul, leste, oeste e centro
        frame.setLayout(new BorderLayout());

// Instanciando uma JLabel e criando o texto para ser mostrado
        JLabel label1 = new JLabel("Label 1");

// Instanciando um JTextField e definindo o número de caracteres
        JTextField textField1 = new JTextField(15);

// Instanciando um JPanel e definindo como topPanel no layout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

// Adicionando ao painel top o label e o text field
        topPanel.add(label1);
        topPanel.add(textField1);

// Criando a variável button1 e instanciando um JButton, definindo o texto do botão
        JButton button1 = new JButton("Botão 1");

// Criando a variável button2 e instanciando um JButton, definindo o texto do botão
        JButton button2 = new JButton("Botão 2");

// Criando a variável button3 e instanciando um JButton, definindo o texto do botão
        JButton button3 = new JButton("Botão 3");

// Instanciando um JPanel e definindo como buttonPanel no layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

// Adicionando ao painel de botões os botões criados
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

// Definindo em qual região ficarão os layouts criados, através do BorderLayout
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

// Define a visibilidade da janela
        frame.setVisible(true);

    }
}