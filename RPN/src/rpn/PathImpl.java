
package rpn;

/**
 *
 * @author Cherry Rose Semeña
 */
public class PathImpl<T> implements Path<T>{

    private T first;
    private Path<T> rest;

    public PathImpl(T... items){
         this(0,items);
    }
    
    public PathImpl(int index, T[] items){
        this.first = items[index];
        if(index == items.length -1){
            this.rest = null;
        }else{
            this.rest = new PathImpl(index+1, items);
        }
    }
    
    public PathImpl(T first, Path<T> rest){
        this.first = first;
        this.rest = rest;
    }
    
    @Override
    public T getFirst() {
        
        return first;
    }

    @Override
    public Path<T> getRest() {
        return rest;
    }
    
}
