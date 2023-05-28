package builder;

public class MyObj {

    private String type;
    private String name;
    private String state;

    private MyObj() {}

    @Override
    public String toString() {
        return "MyObj{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static class Builder{

        private MyObj myObj;

        public Builder(String type) {
            this.myObj = new MyObj();
            this.myObj.type = type;
        }

        public Builder withName(String name) {
            this.myObj.name = name;
            return this;
        }

        public Builder withInitialState(String state) {
            this.myObj.state = state;
            return this;
        }

        public MyObj build() {
            return this.myObj;
        }


    }
}
