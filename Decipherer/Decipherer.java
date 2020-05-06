class Decipherer {
	
	public static void main(String[] args) {
        
	String msg1 ="0@sn9sirppa@#?ia'jgtvryko1";
	String msg2 ="q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
	String msg3 ="aopi?sedohtém@#?sedhtmg+p9l!";

	System.out.println(tailleChaine(msg1));
        System.out.println(tailleChaine(msg2));
	System.out.println(tailleChaine(msg3));
  }
	public static String tailleChaine(String chaine) {
	 int chiffreClé = chaine.length() /2; 
	 String sousChaine = chaine.substring(5);
	 sousChaine = sousChaine.substring(0, chiffreClé);
	 sousChaine = sousChaine.replace("@#?"," "); 
        
	  return new StringBuilder(sousChaine).reverse().toString();
	 
  }
}
