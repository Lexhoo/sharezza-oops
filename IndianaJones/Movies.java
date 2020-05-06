class Movies {

	public static void main(String[] args) {
	String[] titles = {
	"Indiana Jones et le Royaume du Crâne de Cristal",
	"Indiana Jones et la Dernière Croisade",
	"Indiana Jones et le Temple maudit"
    };
	String[] actors = {
	"Harrison Ford, Cate Blanchett, Karen Allen","Harrison Ford, Sean Connery, Denholm Elliott","Harrison Ford, Kate Capshaw, Jonathan Ke Quan"
      };
	for(int i=0; i < titles.length; i++){	      
          System.out.println("Dans le film " + titles[i] + ", les principaux acteurs sont : " + actors[i]);
    };
  }

}
