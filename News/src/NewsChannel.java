class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String headline) {
        System.out.println(name + " received the latest headline: " + headline);
    }

    public String getName() {
        return name;
    }
}
