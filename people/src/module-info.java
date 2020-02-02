
module people {
    requires transitive car;
    requires animal;
    requires house;

    exports example to app;

    uses dog.Dog;
}
