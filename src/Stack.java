// Класс Stack<T> реализует стек с обобщенным типом T
public class Stack<T> {
    private T[] stackArray; // Массив для хранения элементов стека
    private int top; // Индекс верхнего элемента стека
    
    // Конструктор класса Stack, принимающий емкость стека
    public Stack(int capacity) {
        stackArray = (T[]) new Object[capacity]; // Создание массива заданной емкости
        top = -1; // Инициализация верхнего элемента как -1
    }

    // Метод для добавления элемента в стек
    public void push(T item) {
        if (top == stackArray.length - 1) {
            throw new IllegalStateException("Stack overflow"); // Исключение при переполнении стека
        }
        stackArray[++top] = item; // Добавление элемента в стек
    }

    // Метод для извлечения элемента из стека
    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack underflow"); // Исключение при попытке извлечения из пустого стека
        }
        return stackArray[top--]; // Извлечение и возврат элемента из стека
    }

    // Метод для просмотра верхнего элемента стека
    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty"); // Исключение при попытке просмотра пустого стека
        }
        return stackArray[top]; // Возврат верхнего элемента стека
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return (top == -1); // Возвращает true, если стек пуст, иначе false
    }

    // Метод для получения размера стека
    public int size() {
        return (top + 1); // Возвращает количество элементов в стеке
    }
}