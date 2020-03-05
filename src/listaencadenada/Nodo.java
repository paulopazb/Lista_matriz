
package listaencadenada;

 public class Nodo
 {
        private Matriz  elem;
        private Nodo prox;

        public Nodo(){
            elem=new Matriz();
            prox = null;
        }

        public Nodo(Matriz x, Nodo p){
            this.elem = x;
            this.prox = p;
        }

        public void setElem(Matriz x) {
            elem = x;
        }
    
        public Matriz getElem() {
            return elem;
        }

        public void setProx(Nodo p){
            prox = p;  }

        public Nodo getProx(){
            return prox;
        }
 }