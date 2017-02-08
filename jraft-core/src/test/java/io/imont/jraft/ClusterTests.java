/**
 * Copyright 2017 IMONT Technologies
 * Created by romanas on 08/02/2017.
 */
package io.imont.jraft;

import net.data.technology.jraft.RaftParameters;
import org.junit.Test;

public class ClusterTests {

    @Test
    public void test() {
        RaftParameters params = defaultParams();
    }

    @Test
    public void willAddMembersToCluster() {

    }

    @Test
    public void willRemoveMembersFromCluster() {

    }

    private RaftParameters defaultParams() {
        return new RaftParameters()
                .withElectionTimeoutUpper(5000)
                .withElectionTimeoutLower(3000)
                .withHeartbeatInterval(1500)
                .withRpcFailureBackoff(500)
                .withMaximumAppendingSize(200)
                .withLogSyncBatchSize(5)
                .withLogSyncStoppingGap(5)
                .withSnapshotEnabled(5000)
                .withSyncSnapshotBlockSize(0);
    }
}
