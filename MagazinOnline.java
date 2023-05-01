abstract class Produs{
    private String nume;
    private double pret;
    
    public Produs(String nume, double pret){
        this.nume = nume;
        this.pret = pret;
    }
    
    public void setPret(double val){
        this.pret = val;
    }
    
    public double getPret(){
        return this.pret;
    }
    
    public abstract void aplicaReducere(double modifier);
    
    public String toString(){
        return "Denumire: " + this.nume + "   " + "Pret: " + this.pret + "   ";
    }
}

class ProdusImbracaminte extends Produs{
    private String material;
    
    public ProdusImbracaminte(String nume, double pret, String material){
        super(nume, pret);
        this.material = material;
    }
    
    public void aplicaReducere(double modifier){
        if(modifier > 0.95){
            modifier = 0.95;
        }
        this.setPret(this.getPret() - this.getPret() * modifier);
    }
    
    public String toString(){
        return super.toString() + "Material: " + this.material + "   ";
    }
}

class ProdusElectronic extends Produs{
    private boolean resigilat;
    
    public ProdusElectronic(String nume, double pret, boolean resigilat){
        super(nume, pret);
        this.resigilat = resigilat;
    }
    
    public void aplicaReducere(double modifier){
        modifier += 0.2;
        if(modifier > 0.95){
            modifier = 0.95;
        }
        this.setPret(this.getPret() - this.getPret() * modifier);
    }
    
    public String toString(){
        return super.toString() + "Resigilat: " + this.resigilat + "   ";
    }
}

public class MagazinOnline{
    private Produs[] produse = new Produs[1024];
    private int contor=0;
    
    public void adaugaProdus(Produs p){
        try{
            produse[contor]=p;
            contor++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nu mai exista loc in tablou");
        }
    }
    
    public void aplicaReducereBlackFriday(double modifier){
        for(int i=0; i<contor; i++){
            produse[i].aplicaReducere(modifier);
        }
    }
    
    public String toString(){
        String s = "";
        for(int i=0; i<contor; i++){
            s += produse[i].toString() + "\n";
        }
        return s;
    }
    
    public static void main(String[] args){
        MagazinOnline magazin = new MagazinOnline();
        
        magazin.adaugaProdus(new ProdusElectronic("televizor", 4500, false));
        magazin.adaugaProdus(new ProdusElectronic("masina de spalat", 6000, true));
        magazin.adaugaProdus(new ProdusImbracaminte("tricou", 20, "bumbac"));
        magazin.adaugaProdus(new ProdusElectronic("laptop", 3000, false));
        magazin.adaugaProdus(new ProdusImbracaminte("pantaloni", 80, "denim"));
        magazin.adaugaProdus(new ProdusElectronic("telefon", 2000, true));
        
        System.out.println(magazin.toString());
        magazin.aplicaReducereBlackFriday(0.5);
        System.out.println("---BLACK FRIDAY---\n");
        System.out.println(magazin.toString());
    }
}