// https://en.wikipedia.org/wiki/List_of_Formula_One_driver_numbers
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Main extends JFrame implements ActionListener{
	static String[] names = {
	"Damon Hill","Reigning Champion","Stoffel Vandoorne","Daniel Riciardo","Lando Norris","Sebastian Vettel","Nicholas Latifi","Kimi Raikkonen","Romain Grosjean","Nikita Mazepin",
	"Pierre Gasly",	"Sergio Perez","Ayrton Senna","Pastor Maldonado","Fernando Alonso","","Charles Leclerc","Jules Bianchi","Lance Stroll","Felipe Massa", // 15
	"Kevin Magnussen","Esteban Gutierrez","Yuki Tsunoda","Alex Albon","Zhou Guanyu","Jean-Eric Vergne","Daniil Kvyat","Nico Hulkenberg","Brendon Hartley","", // 29
	"Jolyon Palmer","Esteban Ocon","Michael Schumacher","Max Verstappen","34","Sergey Sirotkin","","","","", // 36 37 38 39
	"Paul di Resta","Susie Wolff","","","Lewis Hamilton","","","Mick Schumacher","","", // 40 42 43 45 46 48 49
	"","","","Alexander Rossi","","Carlos Sainz","","","","", // 50 51 52 54 56 57 58 59
	"","","","George Russell","","","","","","", // 60 61 62 64 65 66 67 68 69
	"","","","","","","","Valteri Bottas","","", // 70 71 72 73 74 75 76 78 79
	"","","","","","","","","Robert Kubica","Jack Aitken", // 80 81 82 83 84 85 86 87
	"","","","","Pascal Werlein","","","","Roberto Merhi","Antonio Giovanazzi" // 90 91 92 93 95 96 97
	};
	boolean[] namesSelected = new boolean[100];
	int namesLeft = 100;
	ClassLoader loader = this.getClass().getClassLoader();
	Container content = getContentPane();
	JPanel pnl = new JPanel();
	Box box = Box.createVerticalBox();
	JLabel title = new JLabel(new ImageIcon(loader.getResource("Heading.png")));
	JLabel numlbl = new JLabel("");
	JLabel drvlbl = new JLabel("");
	JButton btn = new JButton("Pick number");
	JLabel leftlbl = new JLabel("");
	public static void main(String[] args){
		Main gui = new Main();
	}
	public Main(){
		super("F1 Driver Bingo 2022");
		setSize(660,320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		numlbl.setToolTipText("Number");
		drvlbl.setToolTipText("Driver name");
		btn.addActionListener(this);

		content.setBackground(Color.white);
		title.setBackground(Color.white);
		pnl.setBackground(Color.white);
		box.setBackground(Color.white);
		btn.setBackground(Color.white);
		leftlbl.setBackground(Color.white);

		numlbl.setFont(new Font("SansSerif",Font.PLAIN,64));
		drvlbl.setFont(new Font("SansSerif",Font.PLAIN,32));

		box.add(title);
		box.add(numlbl);
		box.add(drvlbl);
		box.add(btn);
		box.add(leftlbl);
		pnl.add(box);
		add("North",pnl);
		setVisible(true);
		actionPerformed(null); // to set initial number
	}
	public void actionPerformed(ActionEvent event){
		int random = 0;
		do{
			random = (int) Math.floor(Math.random() * 100);
		}while(random == 100 || namesSelected[random]);
		namesSelected[random] = true;
		namesLeft --;
		leftlbl.setText(String.valueOf(namesLeft) + " left");
		numlbl.setText(String.valueOf(random));
		drvlbl.setText(names[random]);
		if(namesLeft == 0) btn.setEnabled(false);
	}
}