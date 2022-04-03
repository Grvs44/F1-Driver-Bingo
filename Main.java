// https://en.wikipedia.org/wiki/List_of_Formula_One_driver_numbers
import javax.swing.*;
class Main extends JFrame{
	private static String[] names = {
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
	JPanel pnl = new JPanel();
	public static void main(String[] args){
		Main gui = new Main();
	}
	public Main(){
		super("F1 Driver Bingo");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);
	}
}