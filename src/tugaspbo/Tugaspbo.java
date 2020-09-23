
package tugaspbo;

public class Tugaspbo implements Biodata, Nilai {

    /**
     * @param the command line arguments
     */
    public static void main(String[] args) {
        Tugaspbo ps = new Tugaspbo();
        ps.nama();
        ps.tempatlahir();
        ps.hobi();
        ps.agama();
        ps.bahasaindonesia();
        ps.matematika();        
    }
    public void nama(){
        System.out.println("nama:Norma Dwi Evita");
    }
     public void tempatlahir(){
        System.out.println("tempatlahir:11-04-2003");
    }
      public void hobi(){
        System.out.println("hobi:badminton");
    }
       public void agama(){
        System.out.println("agama:80");
    }
        public void bahasaindonesia(){
        System.out.println("bahasaindonesia:85");
    }
         public void matematika(){
        System.out.println("matematika:78");
    }

    @Override
    public void Biodata() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Nilai() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
