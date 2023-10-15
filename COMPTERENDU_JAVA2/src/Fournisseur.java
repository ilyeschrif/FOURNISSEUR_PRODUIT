import java.util.ArrayList;

public class Fournisseur <T> {

    private String nom;
    private int id;
    private ArrayList <T> produits;

    public Fournisseur(String nom,int id)
    {
     this.nom=nom;
     this.id=id;
     this.produits=new ArrayList<>();
    }

    public void ajouterProduit(T prod)
    {
        this.produits.add(prod);
    }

    public ArrayList<T> listeProduits()
    {
        return this.produits;
    }
    public Fournisseur<T> getFournisseur()
    {
       return this;
    }

    public void setFournisseur(String nom,int id,ArrayList<T> prod)
    {
        this.nom=nom;
        this.id=id;
        this.produits=prod;
    }


    public static void main(String [] args)
    {
        Fournisseur<Produit<String>> f1 = new Fournisseur<>("ilyes",123);
        System.out.println(f1.listeProduits());

        Produit<String> p1 = new Produit<>("pc","120",1500);
        Produit<String> p2 = new Produit<>("souris","121",10);
        Produit<String> p3 = new Produit<>("micro","122",40);

        f1.ajouterProduit(p1);
        f1.ajouterProduit(p2);
        f1.ajouterProduit(p3);
        System.out.println(f1.listeProduits());
    }
}
