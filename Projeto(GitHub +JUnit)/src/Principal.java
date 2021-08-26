public  class  Op {

    public  int  menor ( int [] a ) {
        int menor = a [ 0 ];
        para ( int i =  0 ; i <= a . comprimento - 1 ; i ++ ) {
            if (a [i] < menor) {
                menor = a [i];
            }
        }
        return menor;
    }
    public  int  maior ( int [] a ) {
        int maior = a [ 0 ];
        para ( int i =  0 ; i <= a . comprimento -  1 ; i ++ ) {
            if (a [i] > maior) {
                maior = a [i];
            }
        } return maior;
    }
    public  int  soma ( int [] a ) {
        int soma =  0 ;
        para ( int i =  0 ; i <= a . comprimento - 1 ; i ++ ) {
            soma + = a [i];
        } return soma;

    }
    public  int  repitacaoArray ( int [] a , int  numerParaSerEncontrado ) {
        int repitacao = 0 ;
        para ( int i =  0 ; i < a . comprimento; i ++ ) {
            if (a [i] == numerParaSerEncontrado) {
                repitacao ++ ;

            }


        } return repitacao;
    }
}