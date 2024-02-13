class Solution {
    public String defangIPaddr(String address) {
        // return String.join("[.]", address.split("\\."));
        return address.replace(".", "[.]");
    }
}