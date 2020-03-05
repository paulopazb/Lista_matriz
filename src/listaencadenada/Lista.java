
package listaencadenada;

import javax.swing.JOptionPane;

class Lista
{
       private Nodo primero;
       private int cantidad;

       public Lista(){
            primero = null;
            cantidad = 0;
       }

       public boolean vacia() {
           return primero == null;
       }

       public void setCant(int c) {
             cantidad=c;
       }

       public int getCant() {
            return cantidad;
       }
       public Nodo Primero()  {
         Nodo p=primero;
         return p;
       }

       public Nodo crearNodo(Matriz x, Nodo p) {
           Nodo q = new Nodo(x,p);
           return q;
       }

       public void insertarPrimero(Matriz x){
           Nodo q = crearNodo(x, primero);
           primero = q;
           cantidad++;
       }

       public void insertarUltimo(Matriz x) {
           if (vacia())
               insertarPrimero(x);
           else
           {
               Nodo p = primero;
               while (p.getProx() != null)
                   p = p.getProx();

               Nodo q = crearNodo(x,null);
               p.setProx(q);

               cantidad++;
           }
       }

       public void insertarPosicion(Matriz x,int pos) {
           if (pos < 1 || pos > cantidad)
               JOptionPane.showMessageDialog(null,"Posición fuera de rango..!!");
           else
           {
               if (pos == 1)
                   insertarPrimero(x);
               else
               {
                   int i = 1;
                   Nodo p = primero;
                   while (i < pos - 1 && p != null)
                   {
                       p = p.getProx();
                       i = i + 1;
                   }
                   Nodo q = crearNodo(x, p.getProx());
                   p.setProx(q);
                   cantidad++;
               }
           }
       }

        public void eliminarPrimero() {
            if (vacia()){                
               JOptionPane.showMessageDialog(null,"EliminarPrimero::Lista vacia..!!");
               return ;
            }
            Nodo p = primero;
            primero = p.getProx();
            cantidad--;
        }

        public void eliminarUltimo(){
            if (vacia())
                JOptionPane.showMessageDialog(null,"EliminarUltimo::Lista vacia..!!");

            if (cantidad == 1){
                primero = null;
                cantidad = 0;
            }
            else
            {
                Nodo p = primero; Nodo ap = null;
                while (p.getProx() != null)
                {
                    ap = p;
                    p = p.getProx();
                }
                ap.setProx(null);
                cantidad--;
            }
        }

        //elimina el nodo apuntado por p y devuelve el proximo
        //nodo de ap, despues de eliminar
        public Nodo eliminarNodo(Nodo ap, Nodo p) {
            if (ap == null){
                eliminarPrimero();
                return primero;
            }
            else
                ap.setProx(p.getProx());

            return (ap.getProx());
        }

        public void eliminarPosicion(int pos)
        {
            if (pos >= 1 && pos <= getCant())
            {
                int k = 1;
                Nodo ap = null, p = primero;
                while (k < pos && p != null)
                {
                    ap = p;
                    p = p.getProx();
                    k = k + 1;
                }
                if (p == null)
                    return;

                if(ap == null)
                    primero = p.getProx();
                else
                    ap.setProx(p.getProx());
                
                cantidad--;
                //delete p
            }
            else
                JOptionPane.showMessageDialog(null,"Fuera de posición..!!");
        }

        public void eliminarTodo(Matriz x) {
            Nodo p = primero, ap = null;
            while (p != null) {
                if (p.getElem() == x)
                    p = eliminarNodo(ap, p); //la direccion de memoria del sgte nodo
                else
                {
                    ap = p;
                    p = p.getProx();
                }
            }
        }

      
        public void eliminarDuplicados() {
            Nodo p = primero; Nodo aq=null;
            while (p != null) {
                Nodo q = p.getProx();
                aq=p;
                while(q!=null){
                    if (q.getElem() == p.getElem()){
                        q = eliminarNodo(aq, q);
                        cantidad--;
                    }
                    else{
                        aq = q;
                        q = q.getProx();
                    }
                }
                p = p.getProx();
            }
        }

   

   

     

     


}//end clase