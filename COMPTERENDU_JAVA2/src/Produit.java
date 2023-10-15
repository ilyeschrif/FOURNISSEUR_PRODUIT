public class Produit <T>{

    private String nom;
    private String ref;
    private int prix;

    public Produit(String nom,String ref,int prix)
    {
        this.nom=nom;
        this.ref=ref;
        this.prix=prix;
    }

    public void setProduit(String nom,String ref,int prix)
    {
        this.nom=nom;
        this.ref=ref;
        this.prix=prix;
    }

    public Produit getProduit()
    {
        return this;
    }


    public String toString()
    {
        return this.nom;
    }

    public static void main(String [] args)
    {
        Produit<String> p1 = new Produit<>("testprod","testprod",5000);
        System.out.println(p1.getProduit());
    }
}
