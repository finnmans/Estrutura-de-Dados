package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

class Result<T> extends List<T> {

    static List aux = new List<>();

    public static String reverseList(String componentes, int posicao) {

        String s = "";

        // condicional para facilitar
        if (posicao < 0)
            posicao = 0;

        if (posicao > componentes.length())
            return componentes;

        if (componentes != null) {
            List savePoint = new List<>();
            for (int i = 0; i < componentes.length(); i++) {

                if (componentes.charAt(i) == ' ') {

                    savePoint.add(s);
                    // aux.add(s);
                    s = "";

                }
                if(componentes.charAt(i)!= ' ') s += componentes.charAt(i);
            }
            if(posicao > 0)
            for (int i = 0; i < posicao; i++) {
                aux.add(savePoint.search(i));
            }

            for (int j = savePoint.getSize(); j > posicao; j--) {
                aux.add(savePoint.search(j));
            }

            return aux.toString();

        }
        return componentes;
    }
}