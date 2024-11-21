// Do not modify this file!

class Member {
    String name;
    int age;
    
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Member other) {
        return (this.name.equals(other.name)) && (this.age == other.age);
    }

    public String toString() {
        return this.name + " (age: " + this.age + ")";
    }
}
