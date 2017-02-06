
package rpn;

/**
 *
 * @author Cherry Rose Semeña
 */
public interface Path <T> {
    
    T getFirst();
    Path<T> getRest();
}
