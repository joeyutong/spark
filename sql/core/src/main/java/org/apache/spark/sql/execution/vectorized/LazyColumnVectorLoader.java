package org.apache.spark.sql.execution.vectorized;

import org.apache.spark.sql.vectorized.ColumnVector;

public interface LazyColumnVectorLoader {

    void load(ColumnVector column);
}
