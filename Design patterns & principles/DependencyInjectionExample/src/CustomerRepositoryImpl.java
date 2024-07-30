public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate finding a customer by id
        return new Customer(id, "John Doe");
    }
}
