package kz.dar.academy.backend.service;

import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.SessionListener;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Iterator;

public class ClientEntity implements Session {
    @Override
    public String getAuthType() {
        return null;
    }

    @Override
    public void setAuthType(String s) {

    }

    @Override
    public long getCreationTime() {
        return 0;
    }

    @Override
    public long getCreationTimeInternal() {
        return 0;
    }

    @Override
    public void setCreationTime(long l) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getIdInternal() {
        return null;
    }

    @Override
    public void setId(String s) {

    }

    @Override
    public void setId(String s, boolean b) {

    }

    @Override
    public long getThisAccessedTime() {
        return 0;
    }

    @Override
    public long getThisAccessedTimeInternal() {
        return 0;
    }

    @Override
    public long getLastAccessedTime() {
        return 0;
    }

    @Override
    public long getLastAccessedTimeInternal() {
        return 0;
    }

    @Override
    public long getIdleTime() {
        return 0;
    }

    @Override
    public long getIdleTimeInternal() {
        return 0;
    }

    @Override
    public Manager getManager() {
        return null;
    }

    @Override
    public void setManager(Manager manager) {

    }

    @Override
    public int getMaxInactiveInterval() {
        return 0;
    }

    @Override
    public void setMaxInactiveInterval(int i) {

    }

    @Override
    public void setNew(boolean b) {

    }

    @Override
    public Principal getPrincipal() {
        return null;
    }

    @Override
    public void setPrincipal(Principal principal) {

    }

    @Override
    public HttpSession getSession() {
        return null;
    }

    @Override
    public void setValid(boolean b) {

    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void access() {

    }

    @Override
    public void addSessionListener(SessionListener sessionListener) {

    }

    @Override
    public void endAccess() {

    }

    @Override
    public void expire() {

    }

    @Override
    public Object getNote(String s) {
        return null;
    }

    @Override
    public Iterator<String> getNoteNames() {
        return null;
    }

    @Override
    public void recycle() {

    }

    @Override
    public void removeNote(String s) {

    }

    @Override
    public void removeSessionListener(SessionListener sessionListener) {

    }

    @Override
    public void setNote(String s, Object o) {

    }

    @Override
    public void tellChangedSessionId(String s, String s1, boolean b, boolean b1) {

    }

    @Override
    public boolean isAttributeDistributable(String s, Object o) {
        return false;
    }
}
