package org.itxtech.nemisys.raknet.protocol.packet;

import org.itxtech.nemisys.raknet.protocol.Packet;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class PING_DataPacket extends Packet {
    public static final byte ID = (byte) 0x00;

    @Override
    public byte getID() {
        return ID;
    }

    public long pingID;

    @Override
    public void encode() {
        super.encode();
        this.putLong(this.pingID);
    }

    @Override
    public void decode() {
        super.decode();
        this.pingID = this.getLong();
    }

    public static final class Factory implements Packet.PacketFactory {

        @Override
        public Packet create() {
            return new PING_DataPacket();
        }

    }
}
