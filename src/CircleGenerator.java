public class CircleGenerator {

    static void generate(GraphCanvas graphCanvas, int amountOfNodes) {

        int number = 0;

        for (int i = 0; i < amountOfNodes; i++) {
            int R = 100;
            float x = (float) (graphCanvas.getWidth() / 3 - 20 + R * Math.cos(2 * Math.PI * i / amountOfNodes));
            float y = (float) (graphCanvas.getHeight() / 2 + R * Math.sin(2 * Math.PI * i / amountOfNodes));
            Node n = new Node(x, y, 10);
            n.setNumber(number++);
            graphCanvas.addNode(n);
        }
        for (int i = 0; i < amountOfNodes; i++) {
            int R = 100;
            float x = (float) (graphCanvas.getWidth() / 3 - 20 + 2 * R + R * Math.cos(Math.PI - (2 * Math.PI * i / amountOfNodes)));

            float y = (float) (graphCanvas.getHeight() / 2 + R * Math.sin(Math.PI - (2 * Math.PI * i / amountOfNodes)));
            Node n = new Node(x, y, 10);
            n.setNumber(number++);
            graphCanvas.addNode(n);
        }
    }
}
