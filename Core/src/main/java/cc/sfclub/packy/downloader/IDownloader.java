package cc.sfclub.packy.downloader;

import cc.sfclub.packy.repo.data.local.PackageInfo;
import org.jetbrains.annotations.ApiStatus;

import java.io.File;
import java.util.Set;
import java.util.function.Consumer;

@ApiStatus.AvailableSince("0.1.0")
public interface IDownloader {
    void downloadPackages(Set<PackageInfo> tasks, Consumer<Set<TaskResult>> callback);

    TaskResult download(String repo, String packageName, String version);

    void download(String url, Consumer<File> callback);
}
