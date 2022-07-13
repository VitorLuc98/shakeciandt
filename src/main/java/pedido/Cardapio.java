package pedido;

import ingredientes.Ingrediente;

import java.util.TreeMap;

public class Cardapio {
    private TreeMap<Ingrediente,Double> precos;

    public Cardapio(){
        this.precos= new TreeMap<>();
    }

    public TreeMap<Ingrediente, Double> getPrecos(){
        return this.precos;
    }

    public void adicionarIngrediente(Ingrediente ingrediente,Double preco){
        precos.put(ingrediente, preco);
        //TODO
    }

    public boolean atualizarIngrediente(Ingrediente ingrediente,Double preco){
       //TODO
        precos.replace(ingrediente, preco);
        return true;
    }

    public boolean removerIngrediente(Ingrediente ingrediente){
       //TODO
        precos.remove(ingrediente);
        return true;
    }

    public Double buscarPreco(Ingrediente ingrediente){
        //TODO
        return 0.0;
    }

    @Override
    public String toString() {
        return this.precos.toString();
    }

}
