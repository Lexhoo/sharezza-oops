public class Movies {  
    public static void main(String[] args) {

        String[][] indianaMovies = {
            {"Indiana Jones et le Royaume du Crâne de Cristal"}, 
            {"Indiana Jones et la Dernière Croisade"}, 
            {"Indiana Jones et le Temple maudit"}
        };

        String[][] mainActors = {
            {"Harrison Ford", "Cate Blanchett", "Karen Allen"},
            {"Harrison Ford", "Sean Connery", "Denholm Elliott"},
            {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}
        };
      
        for (int i = 0; i < indianaMovies.length; i++){
            System.out.println(
                "Dans le film " 
                + Arrays.toString(indianaMovies[i]).replace("[", "").replace("]", "") 
                + ", les principeaux acteurs sont : " 
                + Arrays.toString(mainActors[i]).replace("[", "").replace("]", "")
            );
        }      
    }
  }
