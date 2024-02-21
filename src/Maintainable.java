public interface Maintainable {

    /* Create an interface like Maintainable for vehicles that need maintenance.
    Not all vehicles might require the same kind of maintenance,
    and this interface will ensure that any class implementing it will provide its own maintenance logic.
     */
    void performMaintenance();

}
