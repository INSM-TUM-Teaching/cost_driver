package cost_driver;

import org.springframework.lang.NonNull;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractCostDriver extends CostDriver {

    protected TimeUnit defualtTimeUnit;
    @NonNull
    protected List<ConcreteCostDriver> children;

    public AbstractCostDriver(String id, @NonNull List<ConcreteCostDriver> children, TimeUnit defaultTimeUnit) {
        super(id);
        this.children = children;
        this.defualtTimeUnit = defaultTimeUnit;
    }

    public List<ConcreteCostDriver> getChildren() {
        return this.children;
    }

    public void addChild(CostDriver concreteCostDriver) {
        children.add((ConcreteCostDriver) concreteCostDriver);
    }

    public TimeUnit getDefualtTimeUnit() {
        return defualtTimeUnit;
    }

    public void setDefualtTimeUnit(TimeUnit defualtTimeUnit) {
        this.defualtTimeUnit = defualtTimeUnit;
    }
}
