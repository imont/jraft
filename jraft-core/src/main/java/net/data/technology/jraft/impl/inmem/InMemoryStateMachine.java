/**
 * Copyright 2017 IMONT Technologies
 * Created by romanas on 08/02/2017.
 */
package net.data.technology.jraft.impl.inmem;

import net.data.technology.jraft.RaftMessageSender;
import net.data.technology.jraft.Snapshot;
import net.data.technology.jraft.StateMachine;

import java.util.concurrent.CompletableFuture;

public class InMemoryStateMachine implements StateMachine {

    @Override
    public void start(final RaftMessageSender raftMessageSender) {

    }

    @Override
    public void commit(final long logIndex, final byte[] data) {

    }

    @Override
    public void rollback(final long logIndex, final byte[] data) {

    }

    @Override
    public void preCommit(final long logIndex, final byte[] data) {

    }

    @Override
    public void saveSnapshotData(final Snapshot snapshot, final long offset, final byte[] data) {

    }

    @Override
    public boolean applySnapshot(final Snapshot snapshot) {
        return false;
    }

    @Override
    public int readSnapshotData(final Snapshot snapshot, final long offset, final byte[] buffer) {
        return 0;
    }

    @Override
    public Snapshot getLastSnapshot() {
        return null;
    }

    @Override
    public CompletableFuture<Boolean> createSnapshot(final Snapshot snapshot) {
        return null;
    }

    @Override
    public void exit(final int code) {

    }
}
