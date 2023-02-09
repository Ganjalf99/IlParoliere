public class Calculator {

    private Integer n1 ;
    private Integer n2;
    private String operatore;

    public void setN(Integer n) {
        //. equals not possible on null type
        if(this.n1 ==null ){

            this.n1 = n;
        }else{
            this.n2 = n;
        }

    }



    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }

    public Integer Somma( ){

        return n1+n2;
    }
    private Integer Sottrazione() {
        return n1-n2;
    }

    public Integer uguale (){
        int risultato = 0;
        switch (operatore){

            case "+":
               risultato =  Somma();
                break;
            case "-":
                risultato =  Sottrazione();
                break;

        }
        this.n1 = null;
        this.n2 = null;
        return risultato;
    }


}
