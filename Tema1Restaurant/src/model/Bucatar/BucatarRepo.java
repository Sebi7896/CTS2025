package model.Bucatar;

import java.util.*;

public class BucatarRepo {
    private Queue<Bucatar> bucatarQueue;

    private BucatarRepo() {
        bucatarQueue = new PriorityQueue<>();
    }
    private static class SingletonHelper {
        private static final BucatarRepo INSTANCE = new BucatarRepo();
    }
    public static BucatarRepo getInstance() {
        return SingletonHelper.INSTANCE;
    }
    public void adaugaBucatar(Bucatar bucatar) {
        bucatarQueue.offer(bucatar);
    }

    public Bucatar alegeBucatar(Scanner scanner) {
        if (bucatarQueue.isEmpty()) {
            System.out.println("Nu sunt bucatari disponibili!");
            return null;
        }

        // Extragem bucătarii care sunt disponibili
        afiseazaBucatari();
        System.out.print("Alege un bucatar:");
        int idBucatar = scanner.nextInt();

        Bucatar bucatarAles = bucatarQueue.stream()
                .filter(bucatar -> bucatar.getId() == idBucatar)
                .findFirst()
                .orElse(null);

        if (bucatarAles == null) {
            System.out.println("Bucătarul selectat nu există!");
            return null;
        }

        // Eliminăm bucătarul din coadă, actualizăm și îl reintroducem
        bucatarQueue.remove(bucatarAles);
        bucatarAles.incrementComenzi();
        bucatarAles.setStatus(false);
        //adauga unde
        bucatarQueue.offer(bucatarAles);
        return bucatarAles;
    }

    public void afiseazaBucatari() {
        Queue<Bucatar> tempQueue = new PriorityQueue<>();
        while (!bucatarQueue.isEmpty()) {
            Bucatar bucatar = bucatarQueue.poll();
            if (bucatar.isStatus()) {
                System.out.println(bucatar);
            }
            tempQueue.offer(bucatar);
        }
        bucatarQueue = tempQueue;
    }
}

