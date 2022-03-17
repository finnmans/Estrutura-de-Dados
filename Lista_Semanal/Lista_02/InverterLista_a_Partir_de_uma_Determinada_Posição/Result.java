package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

public class Result<T> extends List<T>{
    
    static List aux = new List<>();

    public static String reverseList(String componentes, int posicao) {


            //condicional para facilitar
            if(posicao < 0)
                posicao = 0;


           if(posicao > componentes.length()) 
                    return componentes;

            if(componentes != null){

                aux.add(componentes);
                
            }

                return aux.toString();

            }

    }   
}
