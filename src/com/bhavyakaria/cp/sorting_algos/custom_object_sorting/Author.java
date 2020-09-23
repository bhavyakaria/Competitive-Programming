package com.bhavyakaria.cp.sorting_algos.custom_object_sorting;

/**
 * @author Bhavya Karia
 * created on 23/09/20
 *
 * For sorting any particular data type, it needs to implement Comparable
 * String, Integer Class also implement Comparable
 */
public class Author implements Comparable<Author> {
    String firstName;
    String lastName;
    String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }

    @Override
    /**
     * This is where we write the logic to sort. This method sort automatically sort by last name
     * in case the first name is same.
     */
    public int compareTo(Author au) {
        /**
         * Sorting by last name. compareTo should return < 0 if this(keyword)
         * is supposed to be less than au, > 0 if this is supposed to be
         * greater than object au and 0 if they are supposed to be equal.
         *
         * < 0 : au is greater than this(keyword)
         * > 0 : au is less than this(keyword)
         * = 0 : both are equal
         */
        int first = this.firstName.compareTo(au.firstName);
        return first == 0 ? this.lastName.compareTo(au.lastName) : first;
    }
}
