package me.mmuzaf;

/**
 * Created by SBT-Muzafarov-MR on 07.07.2017
 */
public interface ExtendedSupplier<T> extends Supplier<T> {
    Supplier<Row> getRow();
}
