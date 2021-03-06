package assignment1;

public class TxHandler {

    /**
     * Creates a public ledger whose current assignment1.UTXOPool (collection of unspent transaction outputs) is
     * {@code utxoPool}. This should make a copy of utxoPool by using the assignment1.UTXOPool(assignment1.UTXOPool uPool)
     * constructor.
     */
    public TxHandler(UTXOPool utxoPool) {
        // IMPLEMENT THIS
    }

    /**
     * @return true if:
     * (1) all outputs claimed by {@code tx} are in the current assignment1.UTXO pool,
     * (2) the signatures on each input of {@code tx} are valid, 
     * (3) no assignment1.UTXO is claimed multiple times by {@code tx},
     * (4) all of {@code tx}s output values are non-negative, and
     * (5) the sum of {@code tx}s input values is greater than or equal to the sum of its output
     *     values; and false otherwise.
     */
    public boolean isValidTx(Transaction tx) {
        return false;
        // IMPLEMENT THIS
    }

    /**
     * Handles each epoch by receiving an unordered array of proposed transactions, checking each
     * transaction for correctness, returning a mutually valid array of accepted transactions, and
     * updating the current assignment1.UTXO pool as appropriate.
     */
    public Transaction[] handleTxs(Transaction[] possibleTxs) {
        return possibleTxs;
        // IMPLEMENT THIS
    }

}
