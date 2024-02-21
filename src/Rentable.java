public interface Rentable {

    /* An interface like Rentable could be used to define the actions related to the rental process.
    This allows you to ensure that all rentable items, not just vehicles, follow a specific contract for renting.
     */
    // crete the costumer class
    // Rental createRental(Customer customer, int duration);
    void returnRental(Rental rental);
}
