package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

    private double limite;
    double saldo;
    private List<Produto> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = saldo;
        this.compras = new ArrayList<>();
    }
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Produto compra) {
        if (this.limite > compra.getValor()) {
            this.limite -= compra.getValor();
            compras.add(compra);
            return true;
        }
            return false;
        }
    }


