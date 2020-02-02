module animal {
    exports dog to people;
    provides dog.Dog with dog.DogClass, dog.SuperDogClass;
}
