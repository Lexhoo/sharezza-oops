public class ClassRoom {

    public static void main(String[] args) {
    
    Wilder jeanClaude = new Wilder("Jean-Claude");
    jeanClaude.setAware(true);
    Wilder henri = new Wilder("Henri");
    System.out.println(jeanClaude.whoAmI());
    System.out.println(henri.whoAmI());

  }
}
