local JsonWrite
JsonWrite = hookfunction(writefile, function(Event,...)

    if (Event):match("%.json$") ~= nil then
        warn((Event):gsub("%.json$", ".txt"),...)
        return JsonWrite((Event):gsub("%.json$", ".txt"),...)
    else
        warn(Event,...)
        return JsonWrite(Event,...)
    end

end)

local JasonRead
JasonRead = hookfunction(readfile, function(Event,...)

    if (Event):match("%.json$") ~= nil then
        warn((Event):gsub("%.json$", ".txt"),...)
        return JasonRead((Event):gsub("%.json$", ".txt"),...)
    else
        warn(Event,...)
        return JasonRead(Event,...)
    end

end)
