// https://en.wikipedia.org/wiki/List_of_Formula_One_driver_numbers
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Main extends JFrame implements ActionListener{
	static String[] names = {
	"Damon Hill","Reigning Champion","Stoffel Vandoorne","Daniel Riciardo","Lando Norris","Sebastian Vettel","Nicholas Latifi","Kimi Räikkönen","Romain Grosjean","Nikita Mazepin",
	"Pierre Gasly",	"Sergio Perez","Ayrton Senna","Pastor Maldonado","Fernando Alonso","15","Charles Leclerc","Jules Bianchi","Lance Stroll","Felipe Massa",
	"Kevin Magnussen","Esteban Gutiérrez","Yuki Tsunoda","Alex Albon","Zhou Guanyu","Jean-Éric Vergne","Daniil Kvyat","Nico Hulkenberg","Brendon Hartley","29",
	"Jolyon Palmer","Esteban Ocon","Michael Schumacher","Max Verstappen","34","Sergey Sirotkin","36","37","38","39",
	"40","Susie Wolff","42","43","Lewis Hamilton","45","46","Mick Schumacher","48","49",
	"50","51","52","Alexander Rossi","54","Carlos Sainz","56","57","58","59",
	"60","61","62","George Russell","64","65","66","67","68","69",
	"70","71","72","73","74","75","76","Valteri Bottas","78","79",
	"80","81","82","83","84","85","86","87","Robert Kubica","89",
	"90","91","92","93","Pascal Werlein","95","96","97","Roberto Merhi","Antonio Giovanazzi"
	};
	boolean[] namesSelected = new boolean[100];
	int namesLeft = 100;
	ClassLoader loader = this.getClass().getClassLoader();
	Container content = getContentPane();
	JPanel pnl = new JPanel();
	JPanel grid = new JPanel(new GridLayout(3,1));
	JLabel title = new JLabel(new ImageIcon(loader.getResource("Heading.png")));
	JLabel numlbl = new JLabel("");
	JLabel drvlbl = new JLabel("");
	JButton btn = new JButton("Pick number");
	JLabel leftlbl = new JLabel("");
	public static void main(String[] args){
		Main gui = new Main();
	}
	public Main(){
		super("F1 Driver Bingo");
		setSize(660,320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		numlbl.setToolTipText("Number");
		drvlbl.setToolTipText("Driver name");
		//title.setHorizontalTextPosition(JLabel.CENTER);
		//numlbl.setHorizontalTextPosition(JLabel.CENTER);
		//drvlbl.setHorizontalTextPosition(JLabel.CENTER);
		//title.setVerticalTextPosition(JLabel.TOP);
		//numlbl.setVerticalTextPosition(JLabel.CENTER);
		//drvlbl.setVerticalTextPosition(JLabel.CENTER);
		//btn.setVerticalTextPosition(JLabel.BOTTOM);
		btn.addActionListener(this);
		//leftlbl.setVerticalTextPosition(JLabel.BOTTOM);
		//leftlbl.setHorizontalTextPosition(JLabel.CENTER);

		content.setBackground(Color.white);
		title.setBackground(Color.white);
		pnl.setBackground(Color.white);
		grid.setBackground(Color.white);
		//numlbl.setBackground(Color.white);
		//drvlbl.setBackground(Color.RED);
		btn.setBackground(Color.white);
		leftlbl.setBackground(Color.white);

		grid.add(title);
		grid.add(numlbl);
		grid.add(drvlbl);
		pnl.add(btn);
		pnl.add(leftlbl);
		content.add("North",grid);
		content.add("South",pnl);
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