package io.github.regularcommands.commands;

import io.github.regularcommands.provider.AdapterManagerProvider;
import org.bukkit.command.CommandSender;

import java.util.Objects;

/**
 * An immutable object used as a simple data container. It holds a CommandManager, CommandSender and
 * IAdapterManagerProvider object. It is passed to CommandForm instances when a command is executed or tab completed.
 */
public class Context {
    private final CommandManager manager;
    private final CommandSender sender;
    private final AdapterManagerProvider provider;

    /**
     * Creates a new Context object, which contains a CommandManager, CommandSender, and IAdapterManagerProvider
     * objects.
     * @param manager The CommandManager
     * @param sender The CommandSender
     * @param provider The provider
     */
    public Context(CommandManager manager, CommandSender sender, AdapterManagerProvider provider) {
        this.manager = Objects.requireNonNull(manager, "manager cannot be null");
        this.sender = Objects.requireNonNull(sender, "sender cannot be null");
        this.provider = provider;
    }

    /**
     * Gets the manager object.
     * @return The manager stored in this Context object
     */
    public CommandManager getManager() { return manager; }

    /**
     * Gets the CommandSender object.
     * @return The CommandSender stored in this Context object
     */
    public CommandSender getSender() {
        return sender;
    }

    /**
     * Gets the IAdapterManagerProvider object.
     * @return The IAdapterManagerProvider, or null
     */
    public AdapterManagerProvider getProvider() {
        return provider;
    }
}