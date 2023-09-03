import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MemberQueue implements Iterable<Participant> {
    PriorityQueue<Participant> drawQueue;

    public MemberQueue(Collection<Participant> list) {
        this.drawQueue = new PriorityQueue<>(list);
    }

    public MemberQueue() {
        this.drawQueue = new PriorityQueue<>();
    }

    void addMember(Participant p) {
        this.drawQueue.add(p);
    }

    @Override
    public Iterator<Participant> iterator() {
        return new MemberIterator();
    }

    class MemberIterator implements Iterator<Participant> {
        @Override
        public boolean hasNext() {
            return !drawQueue.isEmpty();
        }

        @Override
        public Participant next() {
            return drawQueue.poll();
        }
    }
}

